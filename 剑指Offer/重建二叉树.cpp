struct TreeNode {
    int val;
    TreeNode* left;
    TreeNode* right;
    TreeNode(int x): val(x), left(NULL), right(NULL) {}
};

class Solution {
    public:
    TreeNode* reConstructBinaryTree(vector<int> pre, vector<int> vin) {
        if (pre.size() == 0)
            return NULL;

        TreeNode* root = dfs(pre, vin, 0, pre.size(), 0, vin.size());
        return root;
    }
    
    TreeNode* dfs(vector<int> &pre, vector<int> &vin, int p_l, int p_r, int v_l, int v_r) {
        if (p_l == p_r)
            return NULL;
        TreeNode* root = new TreeNode(pre[p_l]);
        int pos = -1;
        for (int i = v_l; i < v_r; i++)
            if (vin[i] == pre[p_l]) {
                pos = i;
                break;
            }
        
        root->left = dfs(pre, vin, p_l+1, p_l+1+pos-v_l, v_l, pos);
        root->right = dfs(pre, vin, p_l+1+pos-v_l, p_r, pos+1, v_r);
        return root;
    }
};