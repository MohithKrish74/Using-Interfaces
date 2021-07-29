package com.polymorphism;

interface Bank
{
    public void NameOfBank();
    public void Branch();
    public void Sector();
}
class SBI implements Bank
{
    public void NameOfBank()
    {
        System.out.println("This is SBI Bank.");
    }
    public void Branch()
    {
        System.out.println("It has a branch in Chennai.");
    }
    public void Sector()
    {
        System.out.println("It belongs to Government Sector. ");
    }
}
class IndianBank implements Bank
{
    public void NameOfBank()
    {
        System.out.println("This is Indian Bank.");
    }
    public void Branch()
    {
        System.out.println("It has a branch in Chrompet.");
    }
    public void Sector()
    {
        System.out.println("It belongs to Government Sector. ");
    }
}
class ICICI implements Bank
{
    public void NameOfBank()
    {
        System.out.println("This is ICICI Bank.");
    }
    public void Branch()
    {
        System.out.println("It has a branch in Chengalpattu.");
    }
    public void Sector()
    {
        System.out.println("It belongs to Private Sector. ");
    }
}
public class InterfaceExample
{
    public static void main(String[] args)
    {
        SBI sbi = new SBI();
        IndianBank indianBank = new IndianBank();
        ICICI icici = new ICICI();
        System.out.println("Details of SBI Bank: ");
        sbi.NameOfBank();
        sbi.Branch();
        sbi.Sector();
        System.out.println("--------------------------------------------------");
        System.out.println("Details of Indian Bank: ");
        indianBank.NameOfBank();
        indianBank.Branch();
        indianBank.Sector();
        System.out.println("--------------------------------------------------");
        System.out.println("Details of ICICI Bank: ");
        icici.NameOfBank();
        icici.Branch();
        icici.Sector();
        System.out.println("--------------------------------------------------");
    }
}
