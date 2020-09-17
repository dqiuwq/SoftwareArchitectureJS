/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/
/* https://www.onlinegdb.com/online_c++_compiler */
#include <iostream>

using namespace std;

int *testStackArray();

int *testHeapArray();

int main()
{
    int *ptr = testStackArray();

    for (int i=0 ; i<5 ; i++)
        cout << ptr[i] << endl;
    
    cout << "Another test" << endl;
    ptr = testHeapArray();
    
    for (int i=0 ; i<5 ; i++)
        cout << ptr[i] << endl;
    
    return 0;
}

int *testStackArray()
{
    cout << "testStackArray()" << endl;
    static int numbers[5];
    
    for (int i=0 ; i<5 ; i++)
    {
        numbers[i] = i;
        cout << numbers[i] << endl;
    }
    
    int *ptr = numbers;
    
    return ptr;
}

int *testHeapArray()
{
    cout << "testHeapArray()" << endl;
    int *ptr = (int *) calloc(5, sizeof(int));
    for (int i=0 ; i<5 ; i++)
    {
        ptr[i] = 1000+i;
    }
    return ptr;
}