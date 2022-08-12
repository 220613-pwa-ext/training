
my_fibonacci_series = [0, 1]

n = 5 # calculate up to 5th number in the fibonacci series
for i in range(2, n):  # 2 to 49
    current_num = my_fibonacci_series[i - 1] + my_fibonacci_series[i - 2]
    my_fibonacci_series.append(current_num)

print(my_fibonacci_series)
