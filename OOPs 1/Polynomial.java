public class Polynomial {
    private int cof[];
private int deg;
    
    public Polynomial()
    {
        cof=new int[0];
        deg=-1;
    }
        
public void setCoefficient(int degree, int coeff){
        
        if(deg<degree)
        {
            int temp[]=new int[cof.length+degree-deg];
            for(int i=0;i<cof.length;i++)
            {
                temp[i]=cof[i];
            }
            temp[degree]=coeff;
            cof=temp;
            deg=degree;
        }
        else{
            cof[degree]=coeff;
        }
    

    }

// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
public void print(){
        
        for(int i=0;i<cof.length;i++)
        {
            if(cof[i]!=0)
            {
                System.out.print(cof[i]+"x"+i+" ");
            }
        }

}
    
    private int maxdegree(Polynomial p1,Polynomial p2)
    {
        if(p1.deg<=p2.deg)
        {
            return p2.deg;
        }
        else 
        {
            return p1.deg;
        }
    }

// Adds two polynomials and returns a new polynomial which has result
public Polynomial add(Polynomial p){
        Polynomial add=new Polynomial();
        
        int size=maxdegree(this,p);
    
        add.cof=new int[size+1];
        for(int i=0;i<=deg;i++)
        {
        
            add.cof[i]+=cof[i];        
        }
        
        for(int i=0;i<=p.deg;i++)
        {
        
            add.cof[i]+=p.cof[i];        
        }
        
        add.deg=size;
        return add;
}

// Subtracts two polynomials and returns a new polynomial which has result
public Polynomial subtract(Polynomial p){

        Polynomial sub=new Polynomial();
        
        int size=maxdegree(this,p);
    
        sub.cof=new int[size+1];
        for(int i=0;i<=deg;i++)
        {
        
            sub.cof[i]=cof[i];        
        }
        
        for(int i=0;i<=p.deg;i++)
        {
        
            sub.cof[i]-=p.cof[i];        
        }
        
        sub.deg=size;
        return sub;
        
}

// Multiply two polynomials and returns a new polynomial which has result
public Polynomial multiply(Polynomial p){

        Polynomial mul=new Polynomial();
        mul.cof=new int[this.deg+p.deg+1];
        
        for(int i=0;i<=this.deg;i++)
        {
            for(int j=0;j<=p.deg;j++)
            {
                mul.cof[i+j]+=cof[i]*p.cof[j];
            }
        }
        mul.deg=this.deg+p.deg;
        return mul;
}
		
	
}