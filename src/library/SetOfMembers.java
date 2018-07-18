package library;

import java.util.ArrayList;

public class SetOfMembers extends ArrayList<Member> {
//IT16083424 Perera P.A.H.E     SHU ID=27045240
    public void addMember(Member aMember) {
        super.add(aMember);
    }

    public void removeMember(Member aMember) {
        super.remove(aMember);
    }

    public Member getMemberFromName(String name) {
        Member M = null;
        for (int i = 0; i < super.size(); i++) {
            M = super.get(i);
            if (M.getName().equals(name)) {
                break;
            }
        }
        return M;
    }

    public Member getMemberFromID(String mNum) {
        Member M = null;
        for (int i = 0; i < super.size(); i++) {
            M = super.get(i);
            if (M.getMemberID().equals(mNum)) {
                break;
            }
            else{
            M=null;
            }
        }
        return M;
    }

}
