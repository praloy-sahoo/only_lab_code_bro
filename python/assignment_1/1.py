n = int(input("enter  anumber"))
for num in range (2,n+1):
     is_prim= True
     for i in range (2,num):
      if(num%i==0):
        is_prim = False
        break
     if(is_prim):
        print(num) 