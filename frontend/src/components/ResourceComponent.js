
import React,{ useState, useEffect } from "react";
import QaResourceService from "../services/QaResourceService";
import MyContext from '../contexts/MyContext';
import SelectRecords from './SelectRecords';

function ResourceComponent() {

    const [resources, setResources] = useState([]);

    useEffect(() => {
        getResources()
    }, []);


    const getResources = () => {
        QaResourceService.getResources().then((response) => {
            setResources(response.data)
            
        });

    };

    return (

        <>
            <thead>
                <tr>
                    <th>
                       Resource ID
                    </th>


               
                
                    <th>
                        First Name
                    </th>


                

                
                    <th>
                        Last Name
                    </th>


                

                
                    <th>
                        Address
                    </th>


                

                
                    <th>
                        City
                    </th>

                    </tr>
                
            </thead>

            <MyContext.Provider value ={resources}>
            <SelectRecords />
            </MyContext.Provider>
        </>
        

    );

}
export default ResourceComponent;