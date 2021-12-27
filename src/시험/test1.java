package 시험;

public class test1 {
    public static void main(String[] args) {
        int n = 6;
        int m = 5;
        int[] points = {5, -2, 1, 3, -5};
        String[] hands = {"PSPRSS", "SSRRSS", "RRRRRR", "RRSSPP", "SSSRRP"};
        int[][] score = new int[m][n];

        for(int i=0; i<m; i++) {
            int groupCount = 0;
            int S = 0;
            int R = 0;
            int P = 0;
            int point = points[i];

            String hand = hands[i];
            for(int j=0; j<n; j++) {
                if(hand.charAt(j) == 'S'){
                    if(S == 0) groupCount++;
                    S++;
                }
                else if(hand.charAt(j) == 'R'){
                    if(R == 0) groupCount++;
                    R++;
                }
                else if(hand.charAt(j) == 'P') {
                    if(P == 0) groupCount++;
                    P++;
                }
            }

            if(groupCount == 1) {
                int nextPoint = points[i + 1];
                points[i+1] = nextPoint + point;
            }
            else if(groupCount == 2) {
                twoStatus(hand, n, i, point, S, R, P, score);
            }
            else if(groupCount == 3) {
                threeStatus(hand, n, i, point, points, S, R, P, score);
            }
        }

        int[] totalScore = new int[n];
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                totalScore[j] += score[i][j];
            }
        }

        int result = totalScore[0];
        for(int i=1; i<n; i++) {
            if(result < totalScore[i]) {
                result = totalScore[i];
            }
        }
    }

    private static void threeStatus(String hand, int n, int i, int point, int[] points, int S, int R, int P, int[][] score) {

        if(S == R && R == P && S == P) {
            int nextPoint = points[i + 1];
            points[i+1] = nextPoint + point;
        }
        else if(S == R || S == P || R == P) {
            if(S == R) {
                for(int j=0; j<n; j++) {
                    if (hand.charAt(j) == 'P') score[i][j] = point;
                }
            }
            else if(S == P) {
                for(int j=0; j<n; j++) {
                    if (hand.charAt(j) == 'R') score[i][j] = point;
                }
            }
            else if(R == P){
                for (int j = 0; j < n; j++) {
                    if (hand.charAt(j) == 'S') score[i][j] = point;
                }
            }
        } else if(S != R && S != P && R != P) {
            if(point>=0) {
                if(S > R && S > P) {
                    for (int j = 0; j < n; j++) {
                        if (hand.charAt(j) == 'P') score[i][j] = point;
                    }
                }
                else if(R > P && R > S) {
                    for (int j = 0; j < n; j++) {
                        if (hand.charAt(j) == 'S') score[i][j] = point;
                    }
                }
                else if(P > S && P > R) {
                    for (int j = 0; j < n; j++) {
                        if (hand.charAt(j) == 'R') score[i][j] = point;
                    }
                }
            }
            else {
                if(S < R && S < P) {
                    for (int j = 0; j < n; j++) {
                        if (hand.charAt(j) == 'R') score[i][j] = point;
                    }
                }
                else if(R < P && R < S) {
                    for (int j = 0; j < n; j++) {
                        if (hand.charAt(j) == 'P') score[i][j] = point;
                    }
                }
                else if(P < S && P < R) {
                    for (int j = 0; j < n; j++) {
                        if (hand.charAt(j) == 'S') score[i][j] = point;
                    }
                }
            }
        }

    }

    private static void twoStatus(String hand, int n, int i, int point, int S, int R, int P, int[][] score) {
        if(point >= 0) {
            if(S>0) {
                if(R>0) {
                    for(int j=0; j<n; j++) {
                        if(hand.charAt(j) == 'R') score[i][j] = point;
                    }
                }
                else if(P>0) {
                    for(int j=0; j<n; j++) {
                        if(hand.charAt(j) == 'S') score[i][j] = point;
                    }
                }
            }
            else if(R>0) {
                if(S>0) {
                    for(int j=0; j<n; j++) {
                        if(hand.charAt(j) == 'R') score[i][j] = point;
                    }
                }
                else if(P>0) {
                    for(int j=0; j<n; j++) {
                        if(hand.charAt(j) == 'P') score[i][j] = point;
                    }
                }
            }
            else if(P>0) {
                if(S>0) {
                    for(int j=0; j<n; j++) {
                        if(hand.charAt(j) == 'S') score[i][j] = point;
                    }
                }
                else if(R>0) {
                    for(int j=0; j<n; j++) {
                        if(hand.charAt(j) == 'P') score[i][j] = point;
                    }
                }
            }
        }
        else {
            if(S>0) {
                if(R>0) {
                    for(int j=0; j<n; j++) {
                        if(hand.charAt(j) == 'S') score[i][j] = point;
                    }
                }
                else if(P>0) {
                    for(int j=0; j<n; j++) {
                        if(hand.charAt(j) == 'P') score[i][j] = point;
                    }
                }
            }
            else if(R>0) {
                if(S>0) {
                    for(int j=0; j<n; j++) {
                        if(hand.charAt(j) == 'S') score[i][j] = point;
                    }
                }
                else if(P>0) {
                    for(int j=0; j<n; j++) {
                        if(hand.charAt(j) == 'R') score[i][j] = point;
                    }
                }
            }
            else if(P>0) {
                if(S>0) {
                    for(int j=0; j<n; j++) {
                        if(hand.charAt(j) == 'P') score[i][j] = point;
                    }
                }
                else if(R>0) {
                    for(int j=0; j<n; j++) {
                        if(hand.charAt(j) == 'R') score[i][j] = point;
                    }
                }
            }
        }
    }
}
