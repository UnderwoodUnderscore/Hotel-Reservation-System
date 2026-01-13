export default function Field({ type, text }) {

    let dateField = (
        <>
            {/* (calendar icon) date picker */}
            <input type='date'></input>
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
            <input type='number'></input>
        </>
    )

    return (
        <section className={type + 'Field'}>
            <h3>{text}</h3>
            { type === 'date' && dateField }
            { type === 'place' && placeField }
            { type === 'people' && peopleField }
        </section>
    )
}