class GfG
{
    Node flatten(Node root)
    {
        Node l_slide=root;
        Node d_slide=root;
        while(l_slide!=null){
            while(d_slide.bottom!=null){
                d_slide=d_slide.bottom;
            }
            d_slide.bottom=l_slide.next;
            d_slide=d_slide.bottom;
            l_slide=l_slide.next;
        }
        return root;
    }
}