struct ListNode {
    int val;
    struct ListNode* next;
    ListNode(int x): val(x), next(NULL) {}
};

class Solution {
    public:
    vector<int> printListFromTailToHead(ListNode* head) {
        stack<int> st;
        while (head != nullptr)
            st.push(head->val), head = head->next;
        vector<int> ret;
        while (!st.empty())
            ret.push_back(st.top()), st.pop();
        return ret;
    }
};

class Solution {
    public:
    vector<int> printListFromTailToHead(ListNode* head) {
        vector<int> ret;
        dfs(head, ret);
        return ret;
    }

    void dfs(ListNode* head, vector<int> &ret) {
        if (head == nullptr)
            return;
        dfs(head->next, ret);
        ret.push_back(head->val);
    }
};