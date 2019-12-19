#https://pyautogui.readthedocs.io/en/latest/screenshot.html#the-locate-functions
import pyautogui as pag

def buscar(campo):
	X, Y = pag.center(pag.locateOnScreen(campo))
	pag.click(X, Y)

with open("demofile.txt", "r") as f:
	buscar('Campo1.PNG')
	for x in f:
		pag.typewrite(x, interval = 0.0005)
		pag.press('tab')
	
	#buscar boton "Prueba" y dar click
	buscar('Btn1.PNG')
	
	
	#tomar captura de pantalla
	im1 = pag.screenshot('hola.png')
