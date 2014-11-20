#i = 1
#value = 0
t = 600851475143


def isPrime(n):
    if(n==1):
        return False
    for i in range(2,int(n**0.5)+1):
        if n%i==0:
            return False
    return True


def largest_prime_fac(n):
    i = 1
    res = dict()
    while i < n/2:
        #print(i)
        if n%i==0 and isPrime(i)==True:
            res[i] = 'gay'
            print(i)
        i+= 1
    g = res.keys()
    return res[len(g)-1]


#print(largest_prime_fac(t))

def palindrome_short(s):
    t = str(s)
    if t == t[::-1]:
        return True
    else: return False

#print(palindrome_short(77677))

def largest_palindrome():
    i = 100
    rez = dict()
    while i<=999:
        j = 100
        while j<=999:
            if palindrome_short(str(i*j))==True:
                rez[i] = i*j
            j += 1
        i += 1
    h = rez.values()
    return max(h)


def smallest_multiple(n):
    i = 1
    while i<1000000000:
        rez = dict()
        j = 1
        while j<=n:
            if i%j == 0:
                rez[j] = 1
            else:
                rez[j] = 0
            
            j+=1
        h = 0
        g = rez.values()
        sums = sum(g)
        #while h<=len(g):
         #   sums += h
          #  h+=1
        if sums >= 20:
            return i
        i+= 1

def smallest_multiple2(n):
    i = 1
    while(i<10000):
      if((n%1==0)and(n%2==0)and(n%3==0)and(n%4==0)and(n%5==0)and(n%6==0)and(n%7==0)and(n%8==0)and(n%9==0)and(n%10==0)):
        return i
      
      i+=1



b = 7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450


#create a test function and make sure we can create an int from a string. Then finish the function by making the value of each key in the dictionary
#equal to the 13 adjacent numbers in the string whose product formed the number. Do rez.keys(). Do 'max' to find largest number. Then do rez[this number]
#to find the 13 adjacents digits that created the largest product. Return this number. Done!


def largest_consec_13(n):
    rez = dict()
    t = str(n)
    i = 0
    while i<len(t):
        try:
            rez[(int(t[i]))*(int(t[i+1]))*(int(t[i+2]))*(int(t[i+3]))*(int(t[i+4]))*(int(t[i+5]))*(int(t[(i+6)]))*(int(t[(i+7)]))*(int(t[(i+8)]))*(int(t[(i+9)]))*(int(t[(i+10)]))*(int(t[(i+11)]))*(int(t[(i+12)]))] = 'gay'
            
        except:
            break
        i+=1
    g = rez.keys()
    m = max(g)
    return m

def prime_sum(n):
    count = 0
    i = 0
    while i<n:
        if isPrime(i)==True:
            count += i
        i += 1
    return count
            
    
#print(largest_consec_13(b))


#j = [1,2,3]

#h = str(b)
#print(h[1:14])

def large_sum():
    final_sum = 0
    fin = open('large_sum.txt')
    for x in fin:
        word = x.strip()
        words = int(word)
        final_sum += words
    return final_sum

def collatz(n):
    i = n
    count = 0
    while i!=1:
        if i%2==0:
            i = i/2
            count += 1       
        elif i%2 != 0:
            i = (3*i)+1
            count += 1
    return count+1
    
      





def largest_collatz(n):
    rez = dict()
    i = 0
    while i<n:
        rez[collatz(i)] = i
        i+=1
    k = rez.keys()
    m = max(k)
    return rez[m]
    

#print(large_sum())

            
print(largest_collatz(1000000))


#print(prime_sum(2000000))

#print(max(j))


#print(smallest_multiple2(10))


#print(largest_palindrome())
