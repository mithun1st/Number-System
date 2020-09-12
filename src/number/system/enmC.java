
package number.system;


public enum enmC {
    binary(2),octal(8),decimal(10),hexa(16);
    
    int n;
    
    enmC(int a){
        n=a;
    }
}
