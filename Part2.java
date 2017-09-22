package FindGene;

public class Part2 {

	 public String findSimpleGene(String dna,String startCodon,String stopCodon)
	    {
	        String result = "" ;
	        boolean flag = false;
	        if((int)dna.charAt(0)>=97)
	        {
	        	dna = dna.toUpperCase();
	        	//System.out.println("YES"+dna);
	        	flag = true;
	        	
	        }
	        int startIndex = dna.indexOf(startCodon);
	        if(startIndex==-1)
	            return "" ;
	        int stopIndex = dna.indexOf(stopCodon,startIndex+3)+3;
	        if(stopIndex==-1)
	            return "" ;
	        else
	        {
	            if((stopIndex-startIndex)%3==0)
	                result = dna.substring(startIndex,stopIndex);
	        }
	        if(flag)
	        	result = result.toLowerCase();
	        return result;
	    }
	    void testSimpleGene()
	    {
	    	
	        String dna = "CGTAAATGTAATCAT";
	        String gene = findSimpleGene(dna,"ATG","TAA") ;
	        System.out.println("DNA Strand: "+dna+"\nGene: "+gene);
	        dna = "CGTATGTCAT";
	        gene = findSimpleGene(dna,"ATG","TAA") ;
	        System.out.println("DNA Strand: "+dna+"\nGene: "+gene);
	        dna = "CGAAAGTATCAT";
	        gene = findSimpleGene(dna,"ATG","TAA") ;
	        System.out.println("DNA Strand: "+dna+"\nGene: "+gene);
	        dna = "CGTATGTAATCATAACG";
	        gene = findSimpleGene(dna,"ATG","TAA") ;
	        System.out.println("DNA Strandt: "+dna+"\nGene: "+gene);
	        dna = "CGTATGAATAACACG";
	        gene = findSimpleGene(dna,"ATG","TAA") ;
	        System.out.println("DNA Strand: "+dna+"\nGene: "+gene);
	        dna = "atgcttcattaa";
	        gene = findSimpleGene(dna,"ATG","TAA") ;
	        System.out.println("DNA Strand: "+dna+"\nGene: "+gene);
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Part2 gene = new Part2();
	 	gene.testSimpleGene();
}
	
	
	
	
}
