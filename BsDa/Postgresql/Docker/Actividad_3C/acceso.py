import psycopg2
import getpass # Configuración de conexión
import csv #Manejo de archivos formato CSV

DB_HOST = "localhost"
DB_PORT = "5433"
DB_NAME = "credenciales"
DB_USER = 'admin'
DB_PASSWORD = "admin123"


def CargarUsuarios(path_file):
    with open(path_file, newline='', encoding='utf-8') as archivo:
        lector = csv.DictReader(archivo)
        for fila in lector:
            InsertUsuario(fila['id_usuario'],fila['nombre'],fila['correo'],fila['telefono'],fila['fecha_nacimiento'])


def InsertUsuario(id_usuario, nombre, correo, telefono, fecha_nacimiento):
    conn = conectar_db()
    cursor = conn.cursor()
    cursor.execute(
        "INSERT INTO credenciales (id_usuario, nombre, correo, telefono, fecha_nacimiento) VALUES (%s, %s, %s, %s, %s)",
        (id_usuario, nombre, correo, telefono, fecha_nacimiento)
    )
    conn.commit()
    cursor.close()
    conn.close()


def CargarCredenciales(path_file):
    with open(path_file, newline='', encoding='utf-8') as archivo:
        lector = csv.DictReader(archivo)
        for fila in lector:
            InsertCredenciales(fila['id_usuario'],fila['username'],fila['password_hash'])


def InsertCredenciales(id_usuario, username, password_hash):
    conn = conectar_db()
    cursor = conn.cursor()
    cursor.execute(
        "INSERT INTO credenciales (id_usuario, username, password_hash) VALUES (%s, %s, %s)",
        (id_usuario, username, password_hash)
    )
    conn.commit()
    cursor.close()
    conn.close()


def conectar_db():
    """Conecta a la base de datos PostgreSQL y retorna la conexión."""
    try:
        conn = psycopg2.connect(
            host=DB_HOST,
            port=DB_PORT,
            database=DB_NAME,
            user=DB_USER,
            password=DB_PASSWORD
        )

        return conn
    except Exception as e:
        print(e)
        return None
    
if __name__ == "__main__":
    CargarUsuarios('usuarios.csv')
    CargarCredenciales('credenciales.csv')

