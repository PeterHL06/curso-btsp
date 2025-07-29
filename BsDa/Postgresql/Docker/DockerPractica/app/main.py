import os
import psycopg2


def Select(conn, SelectQuery):
    #conn
    #SelectQuery
    cursor = conn.cursor()
    cursor.execute(SelectQuery) #Select * from alumnos;
    data = cursor.fetchall()
    for data_i in data:
        print(data_i)
    cursor.close()

def Insert (matricula, nomnre, edad):
    cursor = conn.cursor()
    conn.execute(
        "INSERT INTO alumnos (matricula, nombre_completo, edad) VALUES (%s,%s,%d)",
        (matricula, nombre, edad)
    )
    conn.commit()
    cursor.close()

try:
    conn = psycopg2.connect(
        host = os.getenv("DB_HOST"),
        database = os.getenv("DB_NAME"),
        user = os.getenv("DB_USER"),
        password = os.getenv("DB_PASS")
    )

    print("Conexión exitosa")
except Exception as e:
    print("Error al conectarnos a la DB: ", e)