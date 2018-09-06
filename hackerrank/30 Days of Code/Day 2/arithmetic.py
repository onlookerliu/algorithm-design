import math
import os
import random
import re
import sys

# Complete the solve function below.


def solve(meal_cost, tip_percent, tax_percent):
    cost = meal_cost * (1 + (tip_percent + tax_percent) / 100.0)

    total_cost = round(cost)
    # print("The total meal cost is " + str(total_cost) + " dollars.")
    print("The total meal cost is {} dollars.".format(total_cost))

if __name__ == '__main__':
    meal_cost = float(input())

    tip_percent = int(input())

    tax_percent = int(input())

    solve(meal_cost, tip_percent, tax_percent)
