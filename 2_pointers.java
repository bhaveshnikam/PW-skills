class arrays {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int l = 0;
        int r = 4;
        int[] ans = runningsum(a);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
        int rd = ans[r] - ans[l - 1];
        System.out.println(rd);
    }

    static int[] runningsum(int a[]) {
        int ans[] = new int[a.length + 1];
        int sum = 0;
        for (int i = 1; i < a.length; i++) {
            sum += a[i];
            ans[i] = sum;
        }
        return ans;
    }
}
