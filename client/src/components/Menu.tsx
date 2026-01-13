export default function Menu({ list }) {

    return (
        <ul className='headerMenu'>
            {list.map((item, index) => (
                <li key={index}>{item}</li>
            ))}
        </ul>
    );
}