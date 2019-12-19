#https://pyautogui.readthedocs.io/en/latest/screenshot.html#the-locate-functions
import pyautogui

f = open('demofile.txt', 'r')

#buscar campo "Código", dar click y escribir
campo1Location = pyautogui.locateOnScreen('Campo2.PNG')
campo1X, campo1Y = pyautogui.center(campo1Location)
pyautogui.click(campo1X, campo1Y)
for x in f:
	pyautogui.typewrite(x, interval = 0.0005)
	pyautogui.press('tab')


#buscar boton "Prueba" y dar click
btnLocation = pyautogui.locateOnScreen('Btn2.PNG')
btnX, btnY = pyautogui.center(btnLocation)
pyautogui.click(btnX, btnY)

#tomar captura de pantalla
#im1 = pyautogui.screenshot('hola.png')
img2 = pyautogui.screenshot("capturita.png", [20,50])
