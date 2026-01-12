export default function Intro({ headerText, descText }) {

    return (
        <section className='intro'>
            <h1>{headerText}</h1>
            <p>{descText}</p>
        </section>
    )
}