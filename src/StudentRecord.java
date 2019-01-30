public class StudentRecord {
    private int[] scores;

    public StudentRecord(int[] score)
    {
        this.scores = score;
    }
    private double average(int first,int last)
    {
        int sum = 0;
        for(int i = first; i < last; i++)
        {
            sum+= scores[i];
        }
        return (double)(sum/(Math.abs(first-last)));
    }
    private boolean hasImproved()
    {
        for(int i = 0; i < scores.length-1; i++)
        {
            if(scores[i] > scores[i+1])
            {
                return false;
            }
        }
        return true;
    }

    public double finalAverage()
    {
        if(hasImproved())
        {
            return average(scores.length/2, scores.length);
        }
        return average(0,scores.length);
    }
}
