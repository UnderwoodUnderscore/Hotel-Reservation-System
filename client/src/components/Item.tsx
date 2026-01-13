export default function Item({ text, onClick }) {

    return (
        <>
            <h2 onClick={onClick}>{text}</h2>
        </>
    )
}