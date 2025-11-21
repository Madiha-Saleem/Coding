/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* swapPairs(struct ListNode* head) {
    if (head==NULL || head->next==NULL)
        return head;
    struct ListNode* newHead=head->next;
    struct ListNode* prev=NULL;
    struct ListNode* curr=head;
    while(curr!=NULL && curr->next!=NULL){
        struct ListNode* nextpair=curr->next->next;
        struct ListNode* second=curr->next;
        second->next=curr;
        curr->next=nextpair;
        if (prev!=NULL)
            prev->next=second;
        prev=curr;
        curr=nextpair;
    }
    return newHead;
}