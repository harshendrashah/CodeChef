def fact(n):
	if n==1:
		return 1
	else:
		return n*fact(n-1)
 
t=int(input())
while t>0:
	a=int(input())
	print(fact(a))
	t-=1 