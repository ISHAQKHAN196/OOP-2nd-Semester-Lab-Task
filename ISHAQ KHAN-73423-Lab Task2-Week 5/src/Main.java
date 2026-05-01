void main() {
    Scanner s = new Scanner(System.in);
    IO.println("Enter Number:");
    int n;
    int count = 0;
    n = s.nextInt();
    for (int i = 1; i < n; i++) {
        if (n % i == 0)
            count++;
    }
    if (count == 2)
        IO.println(n + " Is A Prime Number");
    else
        IO.println(n + " Is Not A Prime Number");
}
