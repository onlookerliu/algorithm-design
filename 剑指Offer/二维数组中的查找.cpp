class Solution {
    public:
    bool Find(int target, vector<vector<int>> array) {
        for (int i = 0; i < (int)array.size(); i++) {
            if (binary_search(array[i].begin(), array[i].end(), target))
                return true;
            return false;
        }
    }
};

class Solution {
    public:
    bool Find(int target, vector<vector<int>> array) {
        int n = array.size(), m = array[0].size();
        int r = n - 1, c = 0;
        while (r >= 0 && c < m) {
            if (target == array[r][c])
                return true;
            else if (target < array[r][c])
                --r;
            else
                ++c;
        }
        return false;
    }
};