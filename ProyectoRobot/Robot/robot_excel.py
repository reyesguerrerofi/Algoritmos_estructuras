import pandas as pd, pyautogui as pag



path = 'prueba_excel.xlsx'
file = pd.read_excel(path, header=None)



for i in range(2):

	x = str(file[0][i])
	pag.typewrite(x, interval = 0.1)
	pag.press('tab')
	print(x)


"""
Se necesita guardar el identificador en una variable para ser enviada al creador de documento
EL dato de pdf se convierte de numero a str
El identificador extraido por el split igual se debe guardar en una variable
"""