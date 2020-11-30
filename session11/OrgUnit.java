package session11;

import java.util.ArrayList;
import java.util.Iterator;

public class OrgUnit {
    private String name;
    private ArrayList<OrgUnit> subUnit;

    public OrgUnit(String orgName) {
        name = orgName;
        subUnit = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }

    public void addSubUnit(OrgUnit su) {
        subUnit.add(su);
    }

    public Iterator<OrgUnit> getIterator() {
        Iterator<OrgUnit> e = new Iterator<OrgUnit>() {
            int currIndex = 0;

            @Override
            public boolean hasNext() {
                return currIndex < subUnit.size();
            }

            @Override
            public OrgUnit next() {
                return subUnit.get(currIndex++);
            }
        };
        return e;
    }

    public String getOrgHierarchy() {
        return getAllNames(this, " ");
    }

    private String getAllNames(OrgUnit ou, String spacing) {
        String ouNames = spacing + ou.name + "\n";
        for (OrgUnit su : ou.subUnit) {
            ouNames += getAllNames(su, spacing + spacing);
        }
        return ouNames;
    }

    public static OrgUnit getOrgData() {
        OrgUnit x = new OrgUnit("x.com");

        // sub units
        OrgUnit hr = new OrgUnit("humana resource");
        x.addSubUnit(hr);
        OrgUnit ms = new OrgUnit("marketing and sales");
        x.addSubUnit(ms);
        OrgUnit pd = new OrgUnit("production");
        x.addSubUnit(pd);

        // sub-sub units
        hr.addSubUnit(new OrgUnit("finance"));
        hr.addSubUnit(new OrgUnit("staff developement"));
        ms.addSubUnit(new OrgUnit("events and campaigns"));
        return x;
    }

    public static void main(String[] args) {
        OrgUnit sample = OrgUnit.getOrgData();
        System.out.println(sample.getOrgHierarchy());
    }
}
