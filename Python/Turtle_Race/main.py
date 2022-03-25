import turtle
import random
import time


def create_turtle(name, color, position_x, position_y):
    name.color(color)
    name.shape("turtle")
    name.shapesize(1.5)
    name.penup()
    name.goto(position_x, position_y)
    name.pendown()


def create_dirt():
    turtle.goto(-350, 200)
    turtle.pendown()
    turtle.color("chocolate")
    turtle.begin_fill()
    for i in range(2):
        turtle.forward(700)
        turtle.right(90)
        turtle.forward(400)
        turtle.right(90)
    turtle.end_fill()


def create_finish_line():
    gap_size = 20
    turtle.shape("square")
    turtle.penup()

    #square white
    turtle.color("white")
    for i in range(10):
        turtle.goto(250, (170-(i*gap_size*2)))
        turtle.stamp()

    for i in range(10):
        turtle.goto(250+gap_size, (210-gap_size) - (i * gap_size * 2))
        turtle.stamp()

    # square black
    turtle.color("black")
    for i in range(10):
        turtle.goto(250, (190 - (i * gap_size * 2)))
        turtle.stamp()

    for i in range(10):
        turtle.goto(250+gap_size, (190-gap_size) - (i * gap_size * 2))
        turtle.stamp()


def turtle_moves(name, name2, name3, name4):
    while name.xcor() <= 230 and name2.xcor() <= 230 and name3.xcor() <= 230 and name4.xcor() <= 230:
        name.forward(random.randint(1, 10))
        name2.forward(random.randint(1, 10))
        name3.forward(random.randint(1, 10))
        name4.forward(random.randint(1, 10))


def check_winner(name, name2, name3, name4):
    if name.xcor() > name2.xcor() and name.xcor() > name3.xcor() and name.xcor() > name4.xcor():
        for i in range(72):
            name.right(5)
            name.shapesize(2.5)

    elif name2.xcor() > name.xcor() and name2.xcor() > name3.xcor() and name2.xcor() > name4.xcor():
        for i in range(72):
            name2.right(5)
            name2.shapesize(2.5)

    elif name3.xcor() > name2.xcor() and name3.xcor() > name.xcor() and name3.xcor() > name4.xcor():
        for i in range(72):
            name3.right(5)
            name3.shapesize(2.5)

    elif name4.xcor() > name2.xcor() and name4.xcor() > name3.xcor() and name4.xcor() > name.xcor():
        for i in range(72):
            name4.right(5)
            name4.shapesize(2.5)


def game():
    create_dirt()
    create_finish_line()
    blue_turtle = turtle.Turtle()
    pink_turtle = turtle.Turtle()
    green_turtle = turtle.Turtle()
    red_turtle = turtle.Turtle()

    create_turtle(blue_turtle, "blue", -300, 150)
    create_turtle(pink_turtle, "magenta", -300, 50)
    create_turtle(green_turtle, "green", -300, -50)
    create_turtle(red_turtle, "red", -300, -150)

    running = True
    while running:
        turtle.setup(800, 500)
        turtle.title("Turtle Race")
        turtle.bgcolor("forestgreen")
        turtle.speed(0)
        time.sleep(1)

        turtle_moves(blue_turtle, pink_turtle, green_turtle, red_turtle)
        check_winner(blue_turtle, pink_turtle, green_turtle, red_turtle)


game()