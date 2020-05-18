FINDING PERCENTAGE
n=int(raw_input())

dic={}

for i in range(n):
	line=raw_input().split()
	dic[line[0]]=sum(map(float,line[1:]))/3.0

print '%.2f' % dic[raw_input()]


EXCEPTION
for t in xrange(int(input())):
    try:
        a,b = map(int,raw_input().split())
        print a/b
    except ZeroDivisionError as e:
        print "Error Code: %s" % e
    except ValueError as e:
        print "Error Code: %s" % e 