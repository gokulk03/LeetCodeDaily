class solution{
    public long gridGame(int[][] grid){


        int n = grid.length;
        int prefixRow1[] = new int[n+1];
        int prefixRow2[] = new int[n+1];

        for(int i=0;i<n;i++){
            prefixRow1[i+1] = prefixRow1[i]+grid[0][i];
            prefixRow2[i+1] = prefixRow2[i]+grid[1][i];
        }
        for(int i=0;i<grid[0].length;i++){
            int toprem = prefixRow1[n] - prefixRow1[i+1];
            int bottomrem = prefixRow2[i] - p
        }
    }
}