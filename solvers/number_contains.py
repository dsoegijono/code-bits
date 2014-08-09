#
# Given numbers x and n, how many numbers between 1 to n contains the number x?
#

x = int(raw_input("Enter number to search.\n> "))
n = int(raw_input("Enter max number.\n> "))

print "Searching for numbers containing " + str(x) + " within " + str(n)
counter = 0

for i in range(x, n):
    if str(x) in str(i):
        counter += 1

if str(x) in str(n):
    counter += 1

print "There are " + str(counter) + " numbers that contains " + str(x) + " between 1-" + str(n)