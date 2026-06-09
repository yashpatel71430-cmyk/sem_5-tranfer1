import csv
filename="c:/sqlite/sub1.csv"
def insert():
    fields = ['stuid','studname','sub1','sub2','sub3','total']
    with open(filename, 'w') as csvfile:
        csvwriter = csv.writer(csvfile)
        csvwriter.writerow(fields)
        n=int(input("how mnay data"))
        for x in range(1,n+1):
            stuid=input("enter stuid")
            studname=input("enter name")
            sub1=input("enter sub1")
            sub2=input("enter sub2")
            sub3=input("enter sub3")
            total=int(sub1)+int(sub2)+int(sub3)
            rows=[stuid,studname,sub1,sub2,sub3,total]
            csvwriter.writerow(rows)


def display():
    fields = []
    roes = []
    lcnt=1
    with open(filename, 'r')as csvfile:
        csvreader = csv.reader(csvfile)
        fields = next(csvreader)
        print(fields[0],"\t" , fields[1],"\t" , fields[2],"\t" , fields[3],"\t" , fields[4],"\t" , fields[5]) 

        for row in csvreader:
            if len(row)>0:
                print(row[0],"\t" , row[1],"\t" , row[2],"\t" , row[3],"\t" , row[4],"\t" ,row[5])
                lcnt+=1
        print("total no. of rows: ",lcnt)

import pandas as pd
import matplotlib.pyplot as plt
def chart():

    df = pd.read_csv(filename)
    print(df)
    plt.title("Student Wise Percentage")
    plt.xlabel("studname")
    plt.ylabel("total")

    plt.bar(df["studname"],df["total"],label=df["studname"])
    plt.legend()
    plt.show()



ch=0
while ch!=5 :
     print("1. insert ")
     print("2. display")
     print("3. chart")

     ch=int(input("enter your choice :: "))
     if ch==1:
         insert()
     elif ch==2:
         display()
     elif ch==3:
         chart()
