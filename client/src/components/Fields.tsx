export default function Field({ type, text }) {

    let dateField = (
        <>
            {/* (calendar icon) date picker */}
            <input type='date' />
        </>
    );

    let peopleField = (
        <>
            {/* (profile icon) numeric field */}
            <input type='number' min='1' placeholder='2' />
        </>
    )

    return (
        <section className={type + 'Field'}>
            <h3 className='ta-left'>{text}</h3>
            { type === 'date' && dateField }
            { type === 'people' && peopleField }
        </section>
    )
}