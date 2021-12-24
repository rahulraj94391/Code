MAX = 100
 
def middleProduct(mat, n):
    row_prod = 1
    col_prod = 1
    for i in range(n) :
        row_prod *= mat[n // 2][i]
        col_prod *= mat[i][n // 2]
    colrowsum = row_prod  + col_prod
    a = str(colrowsum)[::-1].lstrip('0')
    return int(a)
    
if __name__ == "__main__":

    for i in range(R):          # A for loop for row entries
        a =[]
        for j in range(C):      # A for loop for column entries
            a.append(int(input()))
            matrix.append(a)
    
    mat = [[ 1 , 2, 3 ],
           [ 6 , 5, 11 ],
           [ 7, 8, 4 ]]
 
    print(middleProduct(mat, 3))
 
 
 
 