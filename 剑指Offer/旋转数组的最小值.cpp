class Solution {
    public:
    int minNumberInRotateArray(vector<int> rotateArray) {
        if (rotateArray.size() == 0)
            return 0;
        int l = 0, r = rotateArray.size() - 1;
        while (l < r && rotateArray[l] >= rotateArray[r]) {
            int mid = (l + r) / 2;
            if (rotateArray[l] == rotateArray[r] && rotateArray[l] == rotateArray[mid]) {
                int ret = rotateArray[l];
                for (int i = l + 1; i <= r; ret = min(ret, rotateArray[i++]));
                return ret;
            }
            int mid = (l + r) / 2;
            if (rotateArray[mid] >= rotateArray[l])
                l = mid + 1;
            else
                r = mid;
        }
        return rotateArray[l];
    }
};