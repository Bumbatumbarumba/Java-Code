#Text-based game
#Bartosz Kosakowski
#Created on 10/07/16
########################
import sys


def TextBasedGame():
    mainScreen = 1
    gameScreen = 0
    playerResponse = ''
    #playerInfo = infoBox()
    
    """-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
    this while loop only deals with actions
    that are related to the main title screen
    -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-"""
    while mainScreen == 1:
        print('---------------------\n>>TEXT BASED GAME<<\n    Start\n    How to play\n    Command list\n    Exit\n---------------------')
        playerResponse = input('Please type in the exact option: ')
        if playerResponse == 'Start':
            mainScreen = 0
            gameScreen = 1
        elif playerResponse == 'How to play':
            mainScreen = 0
            print("""---------------------
This is a text based game created by
Bartosz Kosakowski on 10/07/16. In order
to proceed with this game, you must type
in commands and the game will output how
that action affects you. For a list of
commands go to the 'Command list' page.
Commands in the 'Command List' can be either
written upper or lower case, but otherwise
must be the same as shown.
TYPE 'Back' TO RETURN TO THE MAIN MENU
---------------------""")
            while playerResponse != 'Back':
                playerResponse = input()
            mainScreen = 1
        elif playerResponse == 'Command list':
            mainScreen = 0
            print('TYPE \'Back\' TO RETURN TO THE MAIN MENU')
            while playerResponse != 'Back':
                playerResponse = input()
            mainScreen = 1
        elif playerResponse == 'Exit':
            print("""---------------------
<
<
<
Goodbye
<
<
<
---------------------""")
            sys.exit(0)
        else:
            print('Please enter a valid command')

    #-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
    #this while loop only deals with actions
    #that are pertainant to the game screen
    #-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
    print("""<
<
<
<
<
---------------------
You are in a forest.
Please enter a valid command.
Type 'Show commands' to see the full list.
---------------------""")
    while gameScreen == 1:
        playerResponse = input().lower()
        if playerResponse == 'go north':
            pass
    
