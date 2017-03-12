#Bartosz Kosakowski
#Created on 12/07/16
########################

"""-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
this class stores all variables and
info relating to locations and inventory;
provides shortcut to describing all
locations and items
-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-"""
class infoBox():
    def __init__(self):
        masterInvQuants = {'sword':1,'shield':1,'bow':1,'arrow':1,'key ring':1,'torch':1}
        masterInvDescs = {'sword':'Old, but still sharp','bow':'Arrows must be equipped to use','musket':'Bullets must be equipped to use','shield':'Looks like it\'s taken some hits','key ring':'Equip to access keys','torch':'illuminates dark areas'}
        masterKeyRing = {'house key', 'basement key', 'upstairs key'}
        masterKeyRingDescs = {'house key':'Unlocks the house\'s front door','basement key':'Unlocks the basement door','upstairs key':'Unlocks the upstairs door'}

    
