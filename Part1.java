package FindGene;

public class Part1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Part1 gene = new Part1();
    	gene.testSimpleGene();
		
	}
	
	 public String findSimpleGene(String dna)
	    {
	        String result = "" ;
	        int startIndex = dna.indexOf("ATG");
	        if(startIndex==-1)
	            return "" ;
	        int stopIndex = dna.indexOf("TAA",startIndex+3)+3;
	        if(stopIndex==-1)
	            return "" ;
	        else
	        {
	            if((stopIndex-startIndex)%3==0)
	                result = dna.substring(startIndex,stopIndex);
	        }
	        return result;
	    }
	    void testSimpleGene()
	    {
	    	
	        String dna = "CGTAAATGTAATCAT";
	        String gene = findSimpleGene(dna) ;
	        System.out.println("DNA Strand: "+dna+"\nGene: "+gene);
	        dna = "CGTATGTCAT";
	        gene = findSimpleGene(dna) ;
	        System.out.println("DNA Strand: "+dna+"\nGene: "+gene);
	        dna = "CGAAAGTATCAT";
	        gene = findSimpleGene(dna) ;
	        System.out.println("DNA Strand: "+dna+"\nGene: "+gene);
	        dna = "CGTATGTAATCATAACG";
	        gene = findSimpleGene(dna) ;
	        System.out.println("DNA Strand: "+dna+"\nGene: "+gene);
	        dna = "CGTATGAATAACACG";
	        gene = findSimpleGene(dna) ;
	        System.out.println("DNA Strand: "+dna+"\nGene: "+gene);
}
	
	
	
	

}
