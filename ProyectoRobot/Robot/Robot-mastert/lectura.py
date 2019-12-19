#Lee un archivo desde un .txt y separa lo generado para sacar distintas "palabras"
'''
Nota: El programa todavia no es general, necesita de las siguientes caracteristicas para serlo:
    -Que tenga una lista de nueva categorias y que puedan ser comparadas
    -Que se genere una nueva lista cada vez que haya una nueva categoria
    -Necesita ser una clase bien definida
    -Que las listas de categorias sean utilizadas de forma agil para el Robot

'''
'''
PROGRAMA GENERAL
Variables:
    f-Archivo
    id=identificador
    ID[],m[]
'''
def clasifica(n,separador):
    """Clasifica los codigos por categorias
    Devuelve una lista que contiene una lista de codigos de una misma 
    categoria.
    Si son de la misma categoria se deben cumplir ciertas condiciones:
    
    -Todos los codigos inician igual
    -Todos los codigos pueden o no terminar igual--(Esta asuncion no debe ser )
    -Categorias diferentes inician diferente.
        categoria1 --> ['QW-ertyuiopQW-ertyuiopQW-ertyuiopQW-ertyuiopQW-ertyuiop']
        categoria2 --> ['AS-dfghjklAS-dfghjklAS-dfghjklAS-dfghjklAS-dfghjkl']
        categoria3 --> ['ZX-cvbnmZX-cvbnmZX-cvbnmZX-cvbnm']
    El input del programa proveniente de un archivo contiene los codigos, estos generalmente estan separados por
    algun identificador como '|'.
    Parámetros:
    Excepciones:
    ValueError -- Si no tiene una lista dentro
    """
    if n == False:
        raise ValueError("No hay una cadena dentro")
    
    '''-----------------------------'''
    
    categoriasJuntas = n.split(separador)
    categoria1 = []
    categoria2 = []
    categoria3 = []
    print(categoriasJuntas)
    for i in range(len(categoriasJuntas)):
        if categoriasJuntas[i].startswith("QW") == True:
            print("categoria QW")
            categoria1.append(categoriasJuntas[i])
        elif categoriasJuntas[i].startswith("AS") == True:
            print("categoria AS")
            categoria2.append(categoriasJuntas[i])
        elif categoriasJuntas[i].startswith("ZX") == True:
            print("categoria ZX")
            categoria3.append(categoriasJuntas[i])
    print(categoria1)
    print(categoria2)
    print(categoria3)

print("Introducir el separador")
separador = str(input())



f = open('prueba.txt','r')

m = f.read()


clasifica(m, separador)


