class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int maxWeight = 0;
        int totalWeight = 0;

        for (int w : weights) {
            maxWeight = Math.max(maxWeight, w);
            totalWeight += w;
        }

        // Start at whichever is larger: the heaviest single box, or (totalWeight / days)
        int capacity = Math.max(maxWeight, totalWeight / days);

        // Keep testing capacities, increasing by 1 until all boxes fit within 'days'
        while (true) {
            int daysUsed = 1;
            int currentLoad = 0;

            for (int w : weights) {
                if (currentLoad + w > capacity) {
                    daysUsed++;       
                    currentLoad = w;    
                } else {
                    currentLoad += w;   
                }
            }


            if (daysUsed <= days) {
                return capacity;
            }


            capacity++;
        }
    }
}