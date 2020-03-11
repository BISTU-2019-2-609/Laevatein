#include <stdio.h>
int digit_sum(int n);
int main(void)
{
    int n;
    int sum = 0;
    scanf("%d", &n);
    sum = digit_sum(n);
    printf("result = %d\n", sum);
    return 0;
}
int digit_sum(int n)
{
    int res;
    res = 0;
    if (n >= 10)
    {
        res = digit_sum(n % 10) + digit_sum(n / 10);
    }
    else
    {
        res = res + n % 10;
    }
    return res;
}