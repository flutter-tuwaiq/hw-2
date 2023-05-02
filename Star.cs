int n = 9;
for (int i = 1; i < n * 2; i++)
    Console.WriteLine(new string('*', (i < n) ? i : n * 2 - i));