from flask import *
import sqlite3, hashlib, os
from werkzeug.utils import secure_filename

sqliteConnection = sqlite3.connect(r'C:\Users\Kinjal\Desktop\vatsal\Flask\violet\database.db')
cursor = sqliteConnection.cursor()


with open("img-13.jpg" , 'rb') as file:
    blobData = file.read()
try:
    pid=114
    cursor.execute("INSERT INTO product_image (pid , img) VALUES (?, ? ) ",(pid,blobData))
    sqliteConnection.commit()
    cursor.close()
except sqlite3.Error as error:
    print("Failed to insert blob data into sqlite table", error)
