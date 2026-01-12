export default function Field({ type, text }) {

    let dateField = (
        <>
            {/* (calendar icon) date picker */}
        </>
    );

    let placeField = (
        <>
            {/* (building icon) dropdown list */}
        </>
    );

    let peopleField = (
        <>
            {/* (profile icon) numeric field */}
        </>
    )

    return (
        <>
            <h3>{text}</h3>
            { type === 'date' && dateField }
            { type === 'place' && placeField }
            { type === 'people' && peopleField }
        </>
    )
}