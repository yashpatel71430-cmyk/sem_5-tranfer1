import sqlite3

conn = sqlite3.connect('C:\sqlite\medecine.db')

cursor = conn.cursor()

def insert():
    med_id = int(input("Enter your medecine id"))
    med_name = input("enter  medecine name")
    qty = int(input("enter  medecine Qty"))
    rate = int(input("enter  medecine rate "))
    cursor.execute("insert into  medecine values (?,?,?,?)",(med_id,med_name,qty,rate))
    conn.commit()

def create():
    table="create table if not exists  medecine (med_id int,med_name varchar(50),qty int,rate int)"
    cursor.execute(table)

def display():
    data=cursor.execute("SELECT * FROM  medecine")
    print("med_id" + "\t" + "med_name"+ "\t" +"qty" + "\t" + "rate")

    for row in data:
        print(str(row[0]) + "\t" + row[1] + "\t" +str( row[2]) + "\t" + str(row[3])+ "\t" + str(row[4]))

def alter():
    #table="alter table  medecine add column total int"
    #cursor.execute(table)
    cursor.execute("update  medecine set total=qty*rate")
    conn.commit()



ch=0
while ch!=3:
    print("1.Create and Insert Table")
    print("2.add colum")
    print("3.Display")
    ch=int(input("enter your choice::"))
    if ch==1:
        create()
        insert()
        display()
    elif ch==2:
        alter()
    elif ch==3:
        display()

