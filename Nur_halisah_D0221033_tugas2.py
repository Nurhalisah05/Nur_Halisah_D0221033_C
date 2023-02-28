#NIM : D0221033
#MENGHITUNG NILAI MEAN
print("NUR HALISAH")
print("====MENGHITUNG NILAI MEAN====")
total = 0
nilai = [0,2,2,1,0,3,3]

a = len(nilai)
for i in range(a):
    total = total + nilai[i]
    print(total)
mean = total/len(nilai)
#Menampilkan nilai mean
print("Nilai mean nya adalah : ",mean)


#Menghitung Median
#membuat list
print("====MENGHITUNG NILAI MEDIAN===")
nilai = [0,2,2,1,0,3,3]

#menghitung panjang list
panjang_list = len(nilai)

#menghitung nilai median
if panjang_list % 2 == 0:
    median1 = nilai[panjang_list//2]
    median2 = nilai[panjang_list//2 - 1]
    median = (median1 + median2)/2
else:
    median = nilai[panjang_list//2]

#menampilkan nilai median
print("Nilai median dari list nilai adalah", median)

#Menghitung Nilai modus
#membuat list
print("===MENGHITUNH NILAI MODUS===")
list_nilai = [0,2,2,1,0,3,3]

#membuat dictionary
dict_nilai = {}

#menghitung jumlah nilai
for n in list_nilai:
    if n not in dict_nilai:
        dict_nilai[n] = 1
    else:
        dict_nilai[n] += 1
print(dict_nilai)
#mencari nilai modus
nilai_modus = 0
jumlah_modus = 0
for key in dict_nilai:
    if dict_nilai[key] > jumlah_modus:
        nilai_modus = key
        jumlah_modus = dict_nilai[key]

#menampilkan nilai modus
print("Nilai modus adalah", nilai_modus)

#Menghitung nilai Quartil
# Membuat list data
print("===MENGHITUNG NILAI QUARTIL====")
data = [0,2,2,1,0,3,3]

# Menghitung jumlah data
n = len(data)

# Menghitung nilai kuartil
if n % 2 == 0:
    # Jika jumlah data genap
    q1 = (data[n//4-1] + data[n//4]) / 2
    q2 = (data[n//2-1] + data[n//2]) / 2
    q3 = (data[3*n//4-1] + data[3*n//4]) / 2
else:
    # Jika jumlah data ganjil
    q1 = data[n//4]
    q2 = data[n//2]
    q3 = data[3*n//4]

# Menampilkan nilai kuartil
print("Nilai kuartil Q1 =", q1)
print("Nilai kuartil Q2 =", q2)
print("Nilai kuartil Q3 =", q3)
