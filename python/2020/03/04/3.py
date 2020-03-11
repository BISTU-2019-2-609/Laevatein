import turtle
import random

def drawSnake(rad,angle,len,neckrad):
    color=['red','green','blue','pink','black','purple']
    for i in range(len):
        turtle.pencolor(color[random.randint(0,5)])
        turtle.circle(rad,angle)
        turtle.pencolor(color[random.randint(0,5)])
        turtle.circle(-rad,angle)
    turtle.circle(rad,angle/2)
    turtle.pencolor(color[random.randint(0,5)])
    turtle.fd(rad)
    turtle.pencolor(color[random.randint(0,5)])
    turtle.circle(neckradrad+1,180)
    turtle.pencolor(color[random.randint(0,5)])
    turtle.fd(rad*2/3)
    turtle.pencolor(color[random.randint(0,5)])

def main():
    turtle.setup(1300,800,0,0)
    pythonsize=30
    turtle.pensize(pythonsize)
    turtle.pencolor("red")
    turtle.seth(-40)
    drawSnake(40,80,5,pythonsize/2)

main()