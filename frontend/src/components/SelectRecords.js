import React from 'react';
import MyContext from '../contexts/MyContext';
import { useState, useContext } from 'react';
import ReactPaginate from 'react-paginate';


function SelectRecords() {
    const resources = useContext(MyContext);

    const [currentPage, setCurrentPage] = useState(0);
    let NUM_OF_RECORDS = resources.length;
    console.log(NUM_OF_RECORDS);

    let LIMIT = 10;
    const numberOfResourcesVisited = currentPage * LIMIT;

    const totalPages = Math.ceil(resources.length / LIMIT);

    const changePage = ({ selected }) => {

        setCurrentPage(selected);
    };
    console.log(resources);
    const displayResources = resources
        .slice(numberOfResourcesVisited,
            numberOfResourcesVisited + LIMIT)
        .map((resource) => {
            return (
                <tr key={resource.personID}>
                    <td> {resource.personID}</td>
                    <td>{resource.lastname}</td>
                    <td>{resource.firstname}</td>
                    <td>{resource.address}</td>
                    <td>{resource.city}</td>
                </tr>

            )

        });

    return (
        <>
            <tbody className="App">{displayResources}</tbody>


            <ReactPaginate
                previousLabel={"← Previous"}
                nextLabel={"Next →"}
                pageCount={totalPages}
                onPageChange={changePage}
                containerClassName={"pagination"}
                previousLinkClassName={"pagination__link"}
                nextLinkClassName={"pagination__link"}
                disabledClassName={"pagination__link--disabled"}
                activeClassName={"pagination__link--active"}

            />

        </>


    );
};

export default SelectRecords;
