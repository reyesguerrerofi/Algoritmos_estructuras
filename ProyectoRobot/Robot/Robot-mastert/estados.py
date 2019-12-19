#https://pyautogui.readthedocs.io/en/latest/screenshot.html#the-locate-functions
import pyautogui
import time

#tomar captura de pantalla
#im1 = pyautogui.screenshot('hola.png')
img2 = pyautogui.screenshot("capturita3.png", region = (20,50,1000,800) )
pyautogui.scroll(50)
img = pyautogui.screenshot("captura5.png",region = (20,50,1000,800))

if img2 == img:
    print("True")
else:
    print("Nop")