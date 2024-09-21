// Lab 8
// Problem 3
// DNA

public class DNA{
    private char[] sequence;

    public DNA(char[] seq){
        sequence = new char[seq.length];
        for (int i = 0; i < sequence.length; i++){
            sequence[i] = seq[i];
        }
    }

    public char[] getSequence(){
        return sequence;
    }

    public DNA swap(DNA other, int swapPoint){
        DNA swapped = new DNA(this.getSequence());
        
        for (int i = swapPoint; i < sequence.length; i++){
            swapped.sequence[i] = other.sequence[i];
        }
        return swapped;
    }

    public boolean equals(DNA other){
        boolean result = true;
        for (int i = 0; i < sequence.length; i++){
            if (sequence[i] != other.sequence[i]) result = false;
        }
        return result;
    }

    public String toString(){
        String sequenceString = "";
        for (int i = 0; i < sequence.length; i++){
            sequenceString += sequence[i];
        }
        return sequenceString;
    }
}