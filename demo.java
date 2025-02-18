class suma{
    int m=9;
    void display(int m)
    {
        this.m=m;
        System.out.println(m);
    }
    public static void main(String args[])
    {
        suma d = new suma();
        //System.out.println(d.m);
        d.display(10);
        System.out.println(d.m);

    }
}